package jp.co.sss.crud.exception;

/**
* システムにエラー、その他のエラーがあった際に送出する例外クラス
* 
* @author Mami Suzuki
*/

public class SystemErrorException extends Exception {

	public SystemErrorException(String msgSystemError, Exception e) {
		super(msgSystemError, e);
	}

}
