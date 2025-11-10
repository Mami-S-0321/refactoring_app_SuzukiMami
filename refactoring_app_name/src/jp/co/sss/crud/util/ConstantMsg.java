package jp.co.sss.crud.util;

/**
 * 設定値をまとめたクラス(文字出力関連)
 *
 * @author Mami Suzuki
 *
 */

public class ConstantMsg {
	
	/** インスタンス化を禁止 */
	private ConstantMsg() {
	}
	
	
	/** メニューの表示 */
	public static final String MSG_EMPLOYEE_SYSTEM = "=== 社員管理システム ===";
	public static final String MSG_ALL_DISPLAY = "1.全件表示";
	public static final String MSG_EMPLOYEE_NAME_SEARCH = "2.社員名検索";
	public static final String MSG_DIVISION_ID_SEARCH = "3.部署ID検索";
	public static final String MSG_NEW_INSERT = "4.新規登録";
	public static final String MSG_UPDATE = "5.更新";
	public static final String MSG_DELETE = "6.削除";
	public static final String MSG_END = "7.終了";
	public static final String MSG_MENU = "メニュー番号を入力してください：";
	
	/** 値を入力 */
	public static final String MSG_EMPLOYEE_NAME = "社員名:";	
	public static final String MSG_GENDER_SELECT = "性別(0:その他, 1:男性, 2:女性, 9:回答なし):";	
	public static final String MSG_BIRTHDAY_SELECT = "生年月日(西暦年/月/日):";	
	public static final String MSG_DIVISION_ID = "部署ID(1:営業部、2:経理部、3:総務部):";	
	
	/** 入力指示 */
	public static final String MSG_DIVISION_ID_INPUT = "部署ID(1:営業部、2:経理部、3:総務部)を入力してください:";
	public static final String MSG_UPDATE_EMPLOYEE_ID = "更新する社員の社員IDを入力してください：";
	public static final String MSG_DELETE_EMPLOYEE_ID = "削除する社員の社員IDを入力してください：";
	public static final String MSG_GENDER_INPUT = "性別(0:回答しない, 1:男性, 2:女性, 9:その他):";
	
	/** 機能の呼出 */
	public static final String MSG_EMPLOYEE_INSERT = "社員情報を登録しました";
	public static final String MSG_EMPLOYEE_UPDATE = "社員情報を更新しました";
	public static final String MSG_EMPLOYEE_DELETE = "社員情報を削除しました";
	public static final String MSG_SYSTEM_END = "システムを終了します。";
	public static final String MSG_NOT_TARGET = "該当者はいませんでした";
	
	/** レコード出力 */
	public static final String MSG_RECORD = "社員ID\t社員名\t性別\t生年月日\t部署名";
	public static final String MSG_NOT_ANSWER = "回答なし";
	public static final String MSG_GENDER_MEN = "男性";
	public static final String MSG_GENDER_WOMAN = "女性";
	public static final String MSG_OTHERS = "その他";
	
	/** 部署名 */
	public static final String MSG_SALES_DEPARTMENT = "営業部";
	public static final String MSG_ACCOUNTING_DEPARTMENT = "経理部";
	public static final String MSG_GENERAL_AFFAIRS_DEPARTMENT = "総務部";

}
