package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Appointment;
import com.utill.DBConnection;

public class AppointmentHistoryService {
	
	private static DBConnection database = DBConnection.getInstance();

    public static List<Appointment> getAllAppointments() {
        ArrayList<Appointment> appointments = new ArrayList<>();

        try {
            Connection con = database.getConnection();

            String query = "SELECT * FROM appointment";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
            	Appointment appointment = new Appointment();

                appointment.setId(rs.getInt("id"));
                appointment.setDoctorId(rs.getInt("doctor_ID"));
                appointment.setPatientId(rs.getInt("patient_ID"));
                appointment.setAppointmentDate(rs.getString("date"));
                appointment.setTime(rs.getString("time"));
                appointment.setStatus(rs.getString("status"));

                appointments.add(appointment);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return appointments;
    }

    public static ArrayList<Appointment> getAppointmentsByPatientId(int patientId) {
        ArrayList<Appointment> appointments = new ArrayList<>();

        try {
            Connection con = database.getConnection();
            String query = "SELECT * FROM appointment WHERE patient_ID = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, patientId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
            	Appointment appointment = new Appointment();

                appointment.setId(rs.getInt("id"));
                appointment.setDoctorId(rs.getInt("doctor_ID"));
                appointment.setPatientId(rs.getInt("patient_ID"));
                appointment.setAppointmentDate(rs.getString("date"));
                appointment.setTime(rs.getString("time"));
                appointment.setStatus(rs.getString("status"));

                appointments.add(appointment);
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            return appointments;
        }

        return appointments;
    }
    
    public static Appointment getAppointmentById(int id) {
        try (Connection con = database.getConnection()) {
            String sql = "SELECT * FROM appointment WHERE id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Appointment(
                    rs.getInt("id"),
                    rs.getInt("doctor_ID"),
                    rs.getInt("patient_ID"),
                    rs.getString("date"),
                    rs.getString("time"),
                    rs.getString("status")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
