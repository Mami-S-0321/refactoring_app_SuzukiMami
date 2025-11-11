package jp.co.sss.crud.exception;

/**
* 入力値に誤りがあった際に送出する例外クラス
* 
*@author Mami Suzuki
*/

public class IllegalInputException extends Exception {

	public IllegalInputException(String errorMsg) {
		super(errorMsg);
	}

}
