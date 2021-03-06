package com.wf.etp.authz.exception;

/**
 * 没有权限的异常
 * 
 * @author wangfan
 * @date 2018-1-23 上午11:23:38
 */
public class UnauthorizedException extends EtpException {
	private static final long serialVersionUID = 8109117719383003891L;

	public UnauthorizedException() {
		super(403, "没有访问权限");
	}
}
