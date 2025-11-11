package jp.co.sss.crud.util;

/**
 * 設定値をまとめたクラス(文字出力関連)
 *
 * @author Mami Suzuki
 *
 */

public class ConstantMsg {
	
	/** システム名 */
	public static final String MSG_MENU_SYSTEM_NAME = "=== 社員管理システム ===";
	/** 全件検索 */
	public static final String MSG_MENU_FIND_ALL = "1.全件表示";
	/** 社員名検索 */
	public static final String MSG_MENU_FIND_BY_EMPLOYEE_NAME = "2.社員名検索";
	/** 部署ID検索 */
	public static final String MSG_MENU_FIND_BY_DEPT_ID = "3.部署ID検索";
	/** 新規登録 */
	public static final String MSG_MENU_INSERT = "4.新規登録";
	/** 更新 */
	public static final String MSG_MENU_UPDATE = "5.更新";
	/** 削除 */
	public static final String MSG_MENU_DELETE = "6.削除";
	/** 終了 */
	public static final String MSG_MENU_END = "7.終了";
	/** メニュー番号入力 */
	public static final String MSG_INPUT_MENU_NUMBER = "メニュー番号を入力してください：";
	
	/** 社員名入力 */
	public static final String INPUT_EMP_NAME = "社員名:";
	/** 更新する部署IDを入力 */
	public static final String UPDATE_DEPT_ID = "部署ID(1:営業部、2:経理部、3:総務部):";
	/** 性別入力 */
	public static final String INPUT_GENDER = "性別(0:回答しない, 1:男性, 2:女性, 9:その他):";
	/** 生年月日入力 */
	public static final String INPUT_BIRTH_DAY = "生年月日(西暦年/月/日):";


	/** 全件表示の際のテーブルのカラム名 */
	public static final String MSG_LIST_CALAM = "社員ID\t社員名\t性別\t生年月日\t部署名";
	/** 該当者がいない場合のメッセージ */
	public static final String MSG_NO_MATCH_FOUND = "該当する社員は存在しません。";
	/** 更新する社員を質問する時のメッセージ */
	public static final String MSG_UPDATE_QUESTION = "更新する社員の社員IDを入力してください：";
	/** 削除する社員を質問する時のメッセージ */
	public static final String MSG_DELETE_QUESTION = "削除する社員の社員IDを入力してください：";
	/** 登録時のメッセージ */
	public static final String MSG_CREATE_COMPLETE = "社員情報を登録しました";
	/** 更新時のメッセージ */
	public static final String MSG_UPDATE_COMPLETE = "社員情報を更新しました";
	/** 削除時のメッセージ */
	public static final String MSG_DELETE_COMPLETE = "社員情報を削除しました";
	/** 終了時のメッセージ */
	public static final String MSG_FINISH = "システムを終了します。";
	/** エラーメッセージ */
	public static final String MSG_SYSTEM_ERROR = "システムエラーです。";
	/**更新・削除の際に対象者がいない場合のメッセージ*/
	public static final String MSG_NO_TARGET_FOUND = "対象者がいませんでした";

	/** バリテーション */
	public static final String MSG_MENUNO_ERROR = "1以上7以下の整数を入力してください";
	public static final String MSG_DEPTID_ERROR = "1以上3以下の整数を入力してください";
	public static final String MSG_BITHDAY_ERROR = "正しい形式(西暦年/月/日)で日付を入力してください";
	public static final String MSG_EMPID_ERROR = "1以上9999以下の整数を入力してください";
	public static final String MSG_GENDER_ERROR = "不正な入力値です。再度入力してください";
	public static final String MSG_EMPNAME_ERROR = "1文字以上30文字以下の文字列を入力してください";

}
