import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class conexion {
	
	private static final String controLador="com.mysql.cj.jdbc.Driver";
	private static final String urL = "jdbc:mysql://localhost:3306/p1. crear base de datos";
	private static final String usr="root";
	private static final String pass="";
	
	public String id;
	public String nom;
	public String ap;
	public String iddc;
	public String esd;
	
	static {
		try {
			Class.forName(controLador);
		}catch(ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}
	
	public Connection conectar() {
		Connection con=null;
		try {
			con=DriverManager.getConnection(urL, usr, pass);
			System.out.println("Conexion correcta");
		}catch(SQLException e) {
			System.out.println("Error en conexion");
		}return con;
	}

	public PreparedStatement insertar() {
		conexion conexion=new conexion();
		Connection cn=null;
		PreparedStatement pstm=null;
		
		try {
			cn=conexion.conectar();
			String insertar="insert into alumnos value (?,?,?,?,?)";
			pstm=cn.prepareStatement(insertar);
			pstm.setString(1, id);
			pstm.setString(2, nom);
			pstm.setString(3, ap);
			pstm.setString(4, iddc);
			pstm.setString(5, esd);

			
			pstm.executeUpdate();
			
			System.out.println("Registro insertado");
			JOptionPane.showMessageDialog(null, "Registro Agregado");

		}catch(Exception e) {
			System.out.println("Error al insertar");
			e.printStackTrace();

		}return pstm;

	}

	public PreparedStatement selecreg() {
		conexion con=new conexion();
		Connection cn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			cn=con.conectar();
			String seleccionar="Select * from alumnos where id=?";
			pstm=cn.prepareStatement(seleccionar);
			pstm.setString(1, id);
			rs=pstm.executeQuery();
			while(rs.next()) {
				id=rs.getString(1);
				nom=rs.getString(2);
				ap=rs.getString(3);
				iddc=rs.getString(4);
				esd=rs.getString(5);
			
			}
			System.out.println("Consulta Exitosa");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(" Error al consultar");
		}
		return pstm;			

	}
	public PreparedStatement actreg() {
		conexion conexion=new conexion();
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			cn=conexion.conectar();
			//String upd="update alumnos set Nombre=?, Apellido_Paterno=?, Apellido_Materno=?,Direccion=?,Delegado=? where ID_alumno=?";
			String upd="update alumnos set Nombre=?, Apellidos=?, Id del curso=?, ¿Es delegado?=? where ID=?";
			pstm=cn.prepareStatement(upd);
			pstm.setString(5, id);
			pstm.setString(1, nom);
			pstm.setString(2, ap);
			pstm.setString(3, iddc);
			pstm.setString(4, esd);
			
			pstm.executeUpdate();
			System.out.println("Registro actualizado");
			JOptionPane.showMessageDialog(null, "Registro Actualizado");

		}catch(Exception e) {
			System.out.println("Error de actualizacion");
			e.printStackTrace();
		}
		return pstm;	
	}

	public PreparedStatement elimreg() {
		conexion conexion=new conexion();
		Connection cn=null;
		PreparedStatement ps=null;

		try {
			cn=conexion.conectar();
			String query="Delete from alumnos where id=?";
			ps=cn.prepareStatement(query);
			ps.setString(1, id);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Registro Eliminado");
			System.out.println("Registro Borrado");

		}catch(Exception e) {
			System.out.println("Error al borrar registro");
			e.printStackTrace();

		}return ps;
    }
}