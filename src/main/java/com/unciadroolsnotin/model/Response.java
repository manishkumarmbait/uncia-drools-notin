package com.unciadroolsnotin.model;

public class Response {

	private Integer loanDue;

	public Response() {
		super();
	}

	public Response(Integer loanDue) {
		super();
		this.loanDue = loanDue;
	}

	public Integer getLoanDue() {
		return loanDue;
	}

	public void setLoanDue(Integer loanDue) {
		this.loanDue = loanDue;
	}

	@Override
	public String toString() {
		return "Response [loanDue=" + loanDue + "]";
	}

}
