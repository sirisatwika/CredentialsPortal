package com.ltts.Springrestapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="created_by")
	private String created_by;
	
	@Column(name="created_date")
	private String created_date;
	
	@Column(name="last_updated_by")
	private String last_updated_by;
	
	@Column(name="last_updated_date")
	private String last_updated_date;
	
	@Column(name="tenant_id")
	private String tenant_id;
	
	@Column(name="account_non_expired")
	private int account_non_expired;
	
	@Column(name="account_non_locked")
	private int account_non_locked;
	
	@Column(name="active")
	private int active;
	
	@Column(name="can_provision")
	private String can_provision;
	
	@Column(name="card_holder_id")
	private String card_holder_id;
	
	@Column(name="cbp_endorsement")
	private String cbp_endorsement;
	
	@Column(name="company")
	private String company;
	
	@Column(name="credentials_non_expired")
	private int credentials_non_expired;
	
	@Column(name="department")
	private String department;
	
	@Column(name="division")
	private String division;
	
	@Column(name="driver_license")
	private String driver_license;
	
	@Column(name="driver_license_state")
	private String driver_license_state;
	
	@Column(name="email")
	private String email;
	
	@Column(name="enabled")
	private int enabled;
	
	@Column(name="entity_type")
	private String entity_type;
	
	@Column(name="eye_color")
	private String eye_color;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="hair_color")
	private String hair_color;
	
	@Column(name="height")
	private String height;
	
	@Column(name="job_title")
	private String job_title;
	
	@Column(name="last_log_on")
	private String last_log_on;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="last_password_reset")
	private String last_password_reset;
	
	@Column(name="license_agreement")
	private int license_agreement;
	
	@Column(name="location")
	private String location;
	
	@Column(name="manager_email")
	private String manager_email;
	
	@Column(name="manager_name")
	private String manager_name;
	
	@Column(name="middle_name")
	private String middle_name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="password_changed")
	private String password_changed;
	
	@Column(name="password_reset")
	private String password_reset;
	
	@Column(name="personnel_id")
	private String personnel_id;
	
	@Column(name="photo_path")
	private String photo_path;
	
	@Column(name="position")
	private String position;
	
	@Column(name="race")
	private String race;
	
	@Column(name="requester_id")
	private String requester_id;
	
	@Column(name="risk_score")
	private String risk_score;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="type")
	private String type;
	
	@Column(name="user_name")
	private String user_name;
	
	@Column(name="valid_from")
	private String valid_from;
	
	@Column(name="valid_to")
	private String valid_to;
	
	@Column(name="weight")
	private String weight;
	
	@Column(name="department_id")
	private String department_id;
	
	@Column(name="division_id")
	private String division_id;
	
	@Column(name="location_id")
	private String location_id;
	
	@Column(name="req_pers_type_id")
	private String req_pers_type_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getLast_updated_by() {
		return last_updated_by;
	}

	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}

	public String getLast_updated_date() {
		return last_updated_date;
	}

	public void setLast_updated_date(String last_updated_date) {
		this.last_updated_date = last_updated_date;
	}

	public String getTenant_id() {
		return tenant_id;
	}

	public void setTenant_id(String tenant_id) {
		this.tenant_id = tenant_id;
	}

	public int getAccount_non_expired() {
		return account_non_expired;
	}

	public void setAccount_non_expired(int account_non_expired) {
		this.account_non_expired = account_non_expired;
	}

	public int getAccount_non_locked() {
		return account_non_locked;
	}

	public void setAccount_non_locked(int account_non_locked) {
		this.account_non_locked = account_non_locked;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getCan_provision() {
		return can_provision;
	}

	public void setCan_provision(String can_provision) {
		this.can_provision = can_provision;
	}

	public String getCard_holder_id() {
		return card_holder_id;
	}

	public void setCard_holder_id(String card_holder_id) {
		this.card_holder_id = card_holder_id;
	}

	public String getCbp_endorsement() {
		return cbp_endorsement;
	}

	public void setCbp_endorsement(String cbp_endorsement) {
		this.cbp_endorsement = cbp_endorsement;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getCredentials_non_expired() {
		return credentials_non_expired;
	}

	public void setCredentials_non_expired(int credentials_non_expired) {
		this.credentials_non_expired = credentials_non_expired;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getDriver_license() {
		return driver_license;
	}

	public void setDriver_license(String driver_license) {
		this.driver_license = driver_license;
	}

	public String getDriver_license_state() {
		return driver_license_state;
	}

	public void setDriver_license_state(String driver_license_state) {
		this.driver_license_state = driver_license_state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getEntity_type() {
		return entity_type;
	}

	public void setEntity_type(String entity_type) {
		this.entity_type = entity_type;
	}

	public String getEye_color() {
		return eye_color;
	}

	public void setEye_color(String eye_color) {
		this.eye_color = eye_color;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHair_color() {
		return hair_color;
	}

	public void setHair_color(String hair_color) {
		this.hair_color = hair_color;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getLast_log_on() {
		return last_log_on;
	}

	public void setLast_log_on(String last_log_on) {
		this.last_log_on = last_log_on;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getLast_password_reset() {
		return last_password_reset;
	}

	public void setLast_password_reset(String last_password_reset) {
		this.last_password_reset = last_password_reset;
	}

	public int getLicense_agreement() {
		return license_agreement;
	}

	public void setLicense_agreement(int license_agreement) {
		this.license_agreement = license_agreement;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getManager_email() {
		return manager_email;
	}

	public void setManager_email(String manager_email) {
		this.manager_email = manager_email;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword_changed() {
		return password_changed;
	}

	public void setPassword_changed(String password_changed) {
		this.password_changed = password_changed;
	}

	public String getPassword_reset() {
		return password_reset;
	}

	public void setPassword_reset(String password_reset) {
		this.password_reset = password_reset;
	}

	public String getPersonnel_id() {
		return personnel_id;
	}

	public void setPersonnel_id(String personnel_id) {
		this.personnel_id = personnel_id;
	}

	public String getPhoto_path() {
		return photo_path;
	}

	public void setPhoto_path(String photo_path) {
		this.photo_path = photo_path;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getRequester_id() {
		return requester_id;
	}

	public void setRequester_id(String requester_id) {
		this.requester_id = requester_id;
	}

	public String getRisk_score() {
		return risk_score;
	}

	public void setRisk_score(String risk_score) {
		this.risk_score = risk_score;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getValid_from() {
		return valid_from;
	}

	public void setValid_from(String valid_from) {
		this.valid_from = valid_from;
	}

	public String getValid_to() {
		return valid_to;
	}

	public void setValid_to(String valid_to) {
		this.valid_to = valid_to;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public String getDivision_id() {
		return division_id;
	}

	public void setDivision_id(String division_id) {
		this.division_id = division_id;
	}

	public String getLocation_id() {
		return location_id;
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}

	public String getReq_pers_type_id() {
		return req_pers_type_id;
	}

	public void setReq_pers_type_id(String req_pers_type_id) {
		this.req_pers_type_id = req_pers_type_id;
	}

	public User(int id, String created_by, String created_date, String last_updated_by, String last_updated_date,
			String tenant_id, int account_non_expired, int account_non_locked, int active, String can_provision,
			String card_holder_id, String cbp_endorsement, String company, int credentials_non_expired,
			String department, String division, String driver_license, String driver_license_state, String email,
			int enabled, String entity_type, String eye_color, String first_name, String gender, String hair_color,
			String height, String job_title, String last_log_on, String last_name, String last_password_reset,
			int license_agreement, String location, String manager_email, String manager_name, String middle_name,
			String password, String password_changed, String password_reset, String personnel_id, String photo_path,
			String position, String race, String requester_id, String risk_score, String telephone, String type,
			String user_name, String valid_from, String valid_to, String weight, String department_id,
			String division_id, String location_id, String req_pers_type_id) {
		super();
		this.id = id;
		this.created_by = created_by;
		this.created_date = created_date;
		this.last_updated_by = last_updated_by;
		this.last_updated_date = last_updated_date;
		this.tenant_id = tenant_id;
		this.account_non_expired = account_non_expired;
		this.account_non_locked = account_non_locked;
		this.active = active;
		this.can_provision = can_provision;
		this.card_holder_id = card_holder_id;
		this.cbp_endorsement = cbp_endorsement;
		this.company = company;
		this.credentials_non_expired = credentials_non_expired;
		this.department = department;
		this.division = division;
		this.driver_license = driver_license;
		this.driver_license_state = driver_license_state;
		this.email = email;
		this.enabled = enabled;
		this.entity_type = entity_type;
		this.eye_color = eye_color;
		this.first_name = first_name;
		this.gender = gender;
		this.hair_color = hair_color;
		this.height = height;
		this.job_title = job_title;
		this.last_log_on = last_log_on;
		this.last_name = last_name;
		this.last_password_reset = last_password_reset;
		this.license_agreement = license_agreement;
		this.location = location;
		this.manager_email = manager_email;
		this.manager_name = manager_name;
		this.middle_name = middle_name;
		this.password = password;
		this.password_changed = password_changed;
		this.password_reset = password_reset;
		this.personnel_id = personnel_id;
		this.photo_path = photo_path;
		this.position = position;
		this.race = race;
		this.requester_id = requester_id;
		this.risk_score = risk_score;
		this.telephone = telephone;
		this.type = type;
		this.user_name = user_name;
		this.valid_from = valid_from;
		this.valid_to = valid_to;
		this.weight = weight;
		this.department_id = department_id;
		this.division_id = division_id;
		this.location_id = location_id;
		this.req_pers_type_id = req_pers_type_id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", created_by=" + created_by + ", created_date=" + created_date + ", last_updated_by="
				+ last_updated_by + ", last_updated_date=" + last_updated_date + ", tenant_id=" + tenant_id
				+ ", account_non_expired=" + account_non_expired + ", account_non_locked=" + account_non_locked
				+ ", active=" + active + ", can_provision=" + can_provision + ", card_holder_id=" + card_holder_id
				+ ", cbp_endorsement=" + cbp_endorsement + ", company=" + company + ", credentials_non_expired="
				+ credentials_non_expired + ", department=" + department + ", division=" + division
				+ ", driver_license=" + driver_license + ", driver_license_state=" + driver_license_state + ", email="
				+ email + ", enabled=" + enabled + ", entity_type=" + entity_type + ", eye_color=" + eye_color
				+ ", first_name=" + first_name + ", gender=" + gender + ", hair_color=" + hair_color + ", height="
				+ height + ", job_title=" + job_title + ", last_log_on=" + last_log_on + ", last_name=" + last_name
				+ ", last_password_reset=" + last_password_reset + ", license_agreement=" + license_agreement
				+ ", location=" + location + ", manager_email=" + manager_email + ", manager_name=" + manager_name
				+ ", middle_name=" + middle_name + ", password=" + password + ", password_changed=" + password_changed
				+ ", password_reset=" + password_reset + ", personnel_id=" + personnel_id + ", photo_path=" + photo_path
				+ ", position=" + position + ", race=" + race + ", requester_id=" + requester_id + ", risk_score="
				+ risk_score + ", telephone=" + telephone + ", type=" + type + ", user_name=" + user_name
				+ ", valid_from=" + valid_from + ", valid_to=" + valid_to + ", weight=" + weight + ", department_id="
				+ department_id + ", division_id=" + division_id + ", location_id=" + location_id
				+ ", req_pers_type_id=" + req_pers_type_id + "]";
	}

	public User() {
		super();
	}
	
	
}
