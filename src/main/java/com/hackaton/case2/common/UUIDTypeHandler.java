package com.hackaton.case2.common;

import org.apache.ibatis.type.*;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import org.apache.ibatis.type.JdbcType;

@MappedJdbcTypes(JdbcType.OTHER)
@MappedTypes(UUID.class)

public class UUIDTypeHandler extends BaseTypeHandler<UUID> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, UUID parameter, JdbcType jdbcType) throws SQLException {
        ps.setObject(i, parameter); // Отправляем UUID как объект
    }

    @Override
    public UUID getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return (UUID) rs.getObject(columnName); // Извлекаем UUID
    }

    @Override
    public UUID getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return (UUID) rs.getObject(columnIndex); // Извлекаем UUID по индексу
    }

    @Override
    public UUID getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return (UUID) cs.getObject(columnIndex); // Извлекаем UUID из CallableStatement
    }


}

