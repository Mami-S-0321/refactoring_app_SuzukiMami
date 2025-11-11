package jp.co.sss.crud.io;

import java.util.List;

import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * コンソール表示をするクラス
 * 
 * @author Mami Suzuki
 */

public class ConsoleWriter {

	/**
	 * メニューの表示
	 */
	public static void showMenu() {
		System.out.println(ConstantMsg.MSG_MENU_SYSTEM_NAME);
		System.out.println(ConstantMsg.MSG_MENU_FIND_ALL);
		System.out.println(ConstantMsg.MSG_MENU_FIND_BY_EMPLOYEE_NAME);
		System.out.println(ConstantMsg.MSG_MENU_FIND_BY_DEPT_ID);
		System.out.println(ConstantMsg.MSG_MENU_INSERT);
		System.out.println(ConstantMsg.MSG_MENU_UPDATE);
		System.out.println(ConstantMsg.MSG_MENU_DELETE);
		System.out.println(ConstantMsg.MSG_MENU_END);
		System.out.print(ConstantMsg.MSG_INPUT_MENU_NUMBER);
	}

	/**
	 * 社員名の表示
	 */
	public static void showEmpNameQuestion() {
		System.out.print(ConstantMsg.INPUT_EMP_NAME);
	}

	/**
	 * 性別を質問するときの表示
	 */
	public static void showGenderQuestion() {
		System.out.print(ConstantMsg.INPUT_GENDER);
	}

	/**
	 * 誕生日を質問するときの表示
	 */
	public static void showBirthDatQuestion() {
		System.out.print(ConstantMsg.INPUT_BIRTH_DAY);
	}

	/**
	 * 部署IDを質問するときの表示
	 */
	public static void showDeptQuestion() {
		System.out.print(ConstantMsg.UPDATE_DEPT_ID);
	}

	/**
	 * 社員データを表示させるとき、該当者がぞんざいするかチェックして表示する
	 */
	public static void showEmployees(List<Employee> employees) {
		if (employees.isEmpty()) {
			showNonExistTarget();
		} else {
			showHeader();
			for (Employee employee : employees) {
				System.out.println(employee);
			}
		}
		System.out.println("");
	}

	/**
	 * 該当者がいないエラーメッセージの表示
	 */
	public static void showNonExistTarget() {
		System.out.println(ConstantMsg.MSG_NO_TARGET_FOUND);
	}

	/**
	 * 対象者がいないときのエラーメッセージの表示
	 */
	public static void showNonMatchTarget() {
		System.out.println(ConstantMsg.MSG_NO_MATCH_FOUND);
	}

	/**
	 * カラムの表示
	 */
	public static void showHeader() {
		System.out.println(ConstantMsg.MSG_LIST_CALAM);
	}

	/**
	 * 新規登録が正常に行われたときの表示
	 */
	public static void showCreateComp() {
		System.out.println(ConstantMsg.MSG_CREATE_COMPLETE);
	}

	/**
	 * 更新処理が正常に行われたときの表示
	 */
	public static void showUpdateComp(int updatedRows) {
		if (updatedRows > 0) {
			System.out.println(ConstantMsg.MSG_UPDATE_COMPLETE);
		} else {
			showNonMatchTarget();
		}
		System.out.println("");
	}

	/**
	 * 削除処理が正常に行われたときの表示
	 */
	public static void showDeleteComp(int deletedRows) {
		if (deletedRows > 0) {
			System.out.println(ConstantMsg.MSG_DELETE_COMPLETE);
		} else {
			showNonMatchTarget();
		}
		System.out.println("");
	}

	/**
	 * 削除する時の質問の表示
	 */
	public static void showDeleteQuestion() {
		System.out.println(ConstantMsg.MSG_DELETE_QUESTION);
	}

	/**
	 * アップデートする時の質問の表示
	 */
	public static void showUpdateQuestion() {
		System.out.println(ConstantMsg.MSG_UPDATE_QUESTION);
	}
}
