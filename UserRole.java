package com.omrbranch.pojo.login;



public class UserRole {
	private int id;
	 private String role;
	 private String name;
	 private String status;
	 private String created_at;
	 private String updated_at;
	 private Pivot pivot;
		public int getId() {
			return id;
		}
		public String getRole() {
			return role;
		}
		public String getName() {
			return name;
		}
		public String getStatus() {
			return status;
		}
		public String getCreated_at() {
			return created_at;
		}
		public String getUpdated_at() {
			return updated_at;
		}
		public Pivot getPivot() {
			return pivot;
		}

}
