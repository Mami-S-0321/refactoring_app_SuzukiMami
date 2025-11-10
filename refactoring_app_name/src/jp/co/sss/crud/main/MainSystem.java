package jp.co.sss.crud.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import jp.co.sss.crud.db.EmployeeDAO;
import jp.co.sss.crud.dto.Department;
import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * 社員情報管理システム開始クラス 社員情報管理システムはこのクラスから始まる。<br/>
 * メニュー画面を表示する。
 *
 * @author System Shared
 *
 */
public class MainSystem {
	/**
	 * 社員管理システムを起動
	 *
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException, ParseException {
		// コンソール入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// エンティティ
		Employee employee = new Employee();
		Department department = new Department();

		// データベースアクセス
		EmployeeDAO employeeDAO = new EmployeeDAO();
		
		List<Employee> employees;

		int menuNo = 0;
		
		do {
			// メニューの表示
			System.out.println(ConstantMsg.MSG_EMPLOYEE_SYSTEM);
			System.out.println(ConstantMsg.MSG_ALL_DISPLAY);
			System.out.println(ConstantMsg.MSG_EMPLOYEE_NAME_SEARCH);
			System.out.println(ConstantMsg.MSG_DIVISION_ID_SEARCH);
			System.out.println(ConstantMsg.MSG_NEW_INSERT);
			System.out.println(ConstantMsg.MSG_UPDATE);
			System.out.println(ConstantMsg.MSG_DELETE);
			System.out.println(ConstantMsg.MSG_END);
			System.out.print(ConstantMsg.MSG_MENU);

			// メニュー番号の入力
			String menuNoStr = br.readLine();
			menuNo = Integer.parseInt(menuNoStr);

			// 機能の呼出
			switch (menuNo) {
			case 1:
				// 全件表示機能の呼出
				EmployeeDAO.findAll();
				break;

			case 2:
				// 社員名検索
				System.out.print(ConstantMsg.MSG_EMPLOYEE_NAME);

				// 検索機能の呼出
				EmployeeDAO.EmployeeNameSearch();
				break;

			case 3:
				// 検索する部署IDを入力
				System.out.print(ConstantMsg.MSG_DIVISION_ID_INPUT);
				String deptIdA = br.readLine();

				// 検索機能の呼出
				EmployeeDAO.EmployeeIdSearch(deptIdA);
				break;

			case 4:
				// 登録する値を入力
				System.out.print(ConstantMsg.MSG_EMPLOYEE_NAME);
				String emp_name = br.readLine();
				System.out.print(ConstantMsg.MSG_GENDER_SELECT);
				String Seibetsu = br.readLine();
				System.out.print(ConstantMsg.MSG_BIRTHDAY_SELECT);
				String birthday = br.readLine();
				System.out.print(ConstantMsg.MSG_DIVISION_ID);
				String deptIdB = br.readLine();

				// 登録機能の呼出
				EmployeeDAO.insert(emp_name, Seibetsu, birthday, deptIdB);
				break;

			case 5:
				// 更新する社員IDを入力
				System.out.print(ConstantMsg.MSG_UPDATE_EMPLOYEE_ID);

				// 更新する値を入力する
				String empId_1 = br.readLine();
				Integer.parseInt(empId_1);

				// 更新機能の呼出
				EmployeeDAO.update(empId_1);
				System.out.println(ConstantMsg.MSG_EMPLOYEE_UPDATE);

				break;

			case 6:
				// 削除する社員IDを入力
				System.out.print(ConstantMsg.MSG_DELETE_EMPLOYEE_ID);

				// 削除機能の呼出
				EmployeeDAO.delete();
				break;

			}
		} while (menuNo != 7);
		System.out.println(ConstantMsg.MSG_SYSTEM_END);
	}
}
