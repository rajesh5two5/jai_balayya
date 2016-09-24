package com.databuck.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.databuck.bean.Role;
import com.databuck.bean.User;
import com.databuck.bean.User;
import com.databuck.dao.IUserDAO;

@Repository
public class UserDAOImpl implements IUserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<User> getData() {
		/*
		 * 
		 * 
		 * 
		 * lastName; salt; password; company; department; email; createdAt;
		 * updatedAt;
		 * 
		 */
		String sql = " SELECT idUser,firstName, lastName,salt, password"
				+ " ,company,department,email,createdAt,updatedAt FROM User";
		List<User> user = jdbcTemplate.query(sql, new RowMapper<User>() {

			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();

				user.setIdUser(rs.getLong("idUser"));
				user.setFirstName(rs.getString("firstName"));
				user.setLastName(rs.getString("lastName"));
				user.setSalt(rs.getString("salt"));
				user.setPassword(rs.getString("password"));
				user.setCompany(rs.getString("company"));
				user.setDepartment(rs.getString("department"));
				user.setEmail(rs.getString("email"));
				user.setCreatedAt(rs.getDate("createdAt"));
				user.setUpdatedAt(rs.getDate("updatedAt"));
				return user;
			}

		});
		return user;

	}

	/*
	 * Delete the User details
	 * 
	 * 
	 */
	public long deleteUser(long idUser) {

		String sql = "DELETE FROM User WHERE idUser=?";
		long count = jdbcTemplate.update(sql, idUser);

		return count;
	}
	/*
	 * Toget the Perticuler user Details
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.databuck.dao.IUserDAO#get(long)
	 */

	public User get(long idUser) {

		/*SELECT u.firstName, r.roleName
		FROM User u, Role r
		WHERE u.idUser > r.idRole && u.idUser =6*/

		String sql = "SELECT u.idUser, u.firstName, r.roleName,r.idRole, u.lastName, "
				+ " u.company, u.department  FROM User u, Role r"
				+ " WHERE u.idUser > r.idRole && u.idUser ="+idUser;
				
		
		

		return jdbcTemplate.query(sql, new ResultSetExtractor<User>() {

			public User extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					User user = new User();

					user.setIdUser(rs.getLong("idUser"));
					user.setFirstName(rs.getString("firstName"));
					user.setRoleName(rs.getString("roleName"));
					user.setIdRole(rs.getLong("idRole"));
					user.setLastName(rs.getString("lastName"));
					user.setCompany(rs.getString("company"));
					user.setDepartment(rs.getString("department"));

					return user;
				}

				return null;
			}

		});
	}

}
