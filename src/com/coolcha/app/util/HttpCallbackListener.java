package com.coolcha.app.util;

public interface HttpCallbackListener {
	/**
	 * ���óɹ�
	 * @param string
	 */
	void onFinish(String string);
	/**
	 * ����ʧ��
	 * @param e
	 */
	void onError(Exception e);

}
