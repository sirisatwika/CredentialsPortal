package com.shadowprjt.azuread.entity;

public class User {
	  
	    private boolean accountEnabled;
		private String displayName;
		private String mailNickname;
		private PasswordProfile passwordprofile;
		private String userPrincipalName;
		public User() {
			super();
		}
		public User(boolean accountEnabled, String displayName, String mailNickname, PasswordProfile passwordprofile,
				String userPrincipalName) {
			super();
			this.accountEnabled = accountEnabled;
			this.displayName = displayName;
			this.mailNickname = mailNickname;
			this.passwordprofile = passwordprofile;
			this.userPrincipalName = userPrincipalName;
		}
		public boolean isAccountEnabled() {
			return accountEnabled;
		}
		public void setAccountEnabled(boolean accountEnabled) {
			this.accountEnabled = accountEnabled;
		}
		public String getDisplayName() {
			return displayName;
		}
		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}
		public String getMailNickname() {
			return mailNickname;
		}
		public void setMailNickname(String mailNickname) {
			this.mailNickname = mailNickname;
		}
		public PasswordProfile getPasswordprofile() {
			return passwordprofile;
		}
		public void setPasswordprofile(PasswordProfile passwordprofile) {
			this.passwordprofile = passwordprofile;
		}
		public String getUserPrincipalName() {
			return userPrincipalName;
		}
		public void setUserPrincipalName(String userPrincipalName) {
			this.userPrincipalName = userPrincipalName;
		}
		@Override
		public String toString() {
			return "User [accountEnabled=" + accountEnabled + ", displayName=" + displayName + ", mailNickname="
					+ mailNickname + ", passwordprofile=" + passwordprofile + ", userPrincipalName=" + userPrincipalName
					+ "]";
		}	 
}
class PasswordProfile{
	String password;
	boolean forceChangePasswordNextLogin;
	public PasswordProfile() {
		super();
	}
	public PasswordProfile(String password, boolean forceChangePasswordNextLogin) {
		super();
		this.password = password;
		this.forceChangePasswordNextLogin = forceChangePasswordNextLogin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isForceChangePasswordNextLogin() {
		return forceChangePasswordNextLogin;
	}
	public void setForceChangePasswordNextLogin(boolean forceChangePasswordNextLogin) {
		this.forceChangePasswordNextLogin = forceChangePasswordNextLogin;
	}
	@Override
	public String toString() {
		return "PasswordProfile [password=" + password + ", forceChangePasswordNextLogin="
				+ forceChangePasswordNextLogin + "]";
	}
}