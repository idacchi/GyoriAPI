package com.gmail.sakaida.yasuhiko.gyoriapi.interfaces;

/**
 * ぎょりAPIのInterfaceです。
 * @author yasuhiko
 *
 */
public interface GyoriAPIInterface {

	/**
	 * ぎょりの名前を返却します。
	 * @return ぎょりの名前
	 */
	public String getName();
	
	/**
	 * ぎょりの年齢を返却します。
	 * @return ぎょりの年齢
	 */
	public int getAge();
	
	/**
	 * ぎょりを現実世界に引き戻します。
	 * @param rw 現実世界のインスタンス
	 */
	public void setRealWorld(RealWorld rw);

}
