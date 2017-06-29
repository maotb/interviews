package main.java.Chapter_14.Section_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Example11 implements Serializable {

	private static final long serialVersionUID = 1L;
	private Date logginDate = new Date();
	private String uid;
	private transient String pwd; // 表示不是该对象串行化的一部分

	public Example11(String user, String password) {
		uid = user;
		pwd = password;
	}

	@Override
	public String toString() {
		String password = null;
		if (pwd == null) {
			password = "NOT SET";
		} else {
			password = pwd;
		}

		return "Example11 [logginDate=" + logginDate + ", user=" + uid + ", password=" + pwd + "]";

	}

	public static void main(String[] args) {
		Example11 logInfo = new Example11("Jinder", "Rh-ab7003");
		System.out.println(logInfo.toString());

		try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("logInfo.out"));
			o.writeObject(logInfo);
			o.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("logInfo.out"));
			Example11 logInfo1 = (Example11) in.readObject();
			System.out.println(logInfo1.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
