package com.gmail.sakaida.yasuhiko.gyoriapi.impl;

import com.gmail.sakaida.yasuhiko.gyoriapi.interfaces.GyoriAPIInterface;
import com.gmail.sakaida.yasuhiko.gyoriapi.interfaces.RealWorld;

/**
 * �����API�̎����ł��B
 * @author yasuhiko
 *
 */
public class GyoriAPIImpl implements GyoriAPIInterface {

	@Override
	public String getName() {
		return "�����";
	}

	@Override
	public int getAge() {
		return 0;
	}

	@Override
	public void setRealWorld(RealWorld rw) {
		// TODO Auto-generated method stub

	}

}
