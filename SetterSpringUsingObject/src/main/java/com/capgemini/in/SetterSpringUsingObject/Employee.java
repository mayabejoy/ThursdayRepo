package com.capgemini.in.SetterSpringUsingObject;

public class Employee {
		String ename;
		String eid;
		double sal;
		Company com;
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getEid() {
			return eid;
		}
		public void setEid(String eid) {
			this.eid = eid;
		}
		public double getSal() {
			return sal;
		}
		public void setSal(double sal) {
			this.sal = sal;
		}
		public Company getCom() {
			return com;
		}
		public void setCom(Company com) {
			this.com = com;
		}
		@Override
		public String toString() {
			return "Employee [ename=" + ename + ", eid=" + eid + ", sal=" + sal + ", com=" + com + "]";
		}
		
}
