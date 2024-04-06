package com.example.demo;

public class Todo{
	private int id;
	private String title;
	private String body;
	private int userId;

	public Todo(int i, String ab, String cd, int i1) {
		Todo t = new Todo();
		t.setId(i);
		t.setTitle(ab);
		t.setBody(cd);
		t.setUserId(i1);
		
	}

	public Todo() {

	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setBody(String body){
		this.body = body;
	}

	public String getBody(){
		return body;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	@Override
 	public String toString(){
		return 
			"Todo{" + 
			"id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",body = '" + body + '\'' + 
			",userId = '" + userId + '\'' + 
			"}";
		}
}
