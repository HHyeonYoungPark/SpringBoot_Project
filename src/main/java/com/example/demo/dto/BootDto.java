package com.example.demo.dto;

public class BootDto {
	private int idx;
	private String title;
	private String writer;
	private String pw;
	private String content;
	private String regdate;
	
	public BootDto() {}

	public BootDto(int idx, String title, String writer, String pw, String content, String regdate) {		
		this.idx = idx;
		this.title = title;
		this.writer = writer;
		this.pw = pw;
		this.content = content;
		this.regdate = regdate;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
	
	
}
