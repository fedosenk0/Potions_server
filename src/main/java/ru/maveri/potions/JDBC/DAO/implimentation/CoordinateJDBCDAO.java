package ru.maveri.potions.JDBC.DAO.implimentation;

import org.springframework.beans.factory.annotation.Autowired;
import ru.maveri.potions.JDBC.DAO.Interface.CoordinateDAORepo;
import ru.maveri.potions.JDBC.util.Util;
import ru.maveri.potions.model.Coordinate;
import ru.maveri.potions.model.enums.Type;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CoordinateJDBCDAO implements CoordinateDAORepo {


    private Coordinate coordinate;

    @Autowired
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public Optional<Coordinate> getCoordinateById(long userId) {
        Connection connection = Util.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM coordinate WHERE id = ?");
            preparedStatement.setLong(1,userId);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();
            if(resultSet.next()){
                coordinate.setLatitude(resultSet.getLong("latitude"));
                coordinate.setLongitude(resultSet.getLong("longitude"));
                coordinate.setType(Type.getType(resultSet.getString("type")));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Optional.of(coordinate);
    }

    public List<Coordinate> findByLatitudeBetweenAndLongitudeBetween(Long lat, Long latr, Long lon, Long lonr){
        Connection connection = Util.getConnection();
        ArrayList<Coordinate> arrayList = new ArrayList<>();
        try {
            PreparedStatement   preparedStatement = connection.prepareStatement("SELECT c.id FROM coordinate c " +
                    "WHERE c.latitude BETWEEN ? AND ? AND c.longitude BETWEEN ? AND ?");
            preparedStatement.setLong(1,lat);
            preparedStatement.setLong(2,latr);
            preparedStatement.setLong(3,lon);
            preparedStatement.setLong(4,lonr);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                arrayList.add(getCoordinateById(resultSet.getInt("id")).get());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
