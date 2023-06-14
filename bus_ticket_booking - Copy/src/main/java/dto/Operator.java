package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Operator {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int operator_id;
	private int operator_pwd;
	private int operator_cpwd;
	
	
	public int getOperator_id() {
		return operator_id;
	}
	public void setOperator_id(int operator_id) {
		this.operator_id = operator_id;
	}
	public int getOperator_pwd() {
		return operator_pwd;
	}
	public void setOperator_pwd(int operator_pwd) {
		this.operator_pwd = operator_pwd;
	}
	public int getOperator_cpwd() {
		return operator_cpwd;
	}
	public void setOperator_cpwd(int operator_cpwd) {
		this.operator_cpwd = operator_cpwd;
	}
	
	
}
