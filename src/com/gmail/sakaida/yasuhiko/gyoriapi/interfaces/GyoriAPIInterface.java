package com.gmail.sakaida.yasuhiko.gyoriapi.interfaces;

/**
 * �����API��Interface�ł��B
 * @author yasuhiko
 *
 */
public interface GyoriAPIInterface {

	/**
	 * �����̖��O��ԋp���܂��B
	 * @return �����̖��O
	 */
	public String getName();
	
	/**
	 * �����̔N���ԋp���܂��B
	 * @return �����̔N��
	 */
	public int getAge();
	
	/**
	 * �������������E�Ɉ����߂��܂��B
	 * @param rw �������E�̃C���X�^���X
	 */
	public void setRealWorld(RealWorld rw);

}
