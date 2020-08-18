package edu.uog.course.model;

public class Course {
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import com.fasterxml.jackson.annotation.JsonIgnore;

	@Entity
	@Table(name = "TBLCOURSE")
	



		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long COURSE_ID;
		
		@Column(name = "COURSE_CODE")
		private String COURSE_CODE;
		
		@Column(name = "COURSE_TITLE")
		private String COURSE_TITLE;
		
		@Column(name = "COURSE_DESC")
		private String COURSE_DESC;
		
		@Column(name = "COURSE_CREDITHOUR")
		private Long COURSE_CREDITHOUR;
		
		@Column(name = "COURSEPRERQUIST_ID")
		private Long COURSEPRERQUIST_ID;

		@Column(name = "ISACTIVE")
		private String ISACTIVE;

		@JsonIgnore
		@Column(name = "MODIFIED_BY")
		 private Long MODIFIED_BY;

		@JsonIgnore
		@Column(name = "MODIFIED_WHEN")
		private String MODIFIED_WHEN;

		@JsonIgnore
		@Column(name = "MODIFIED_WORKSTATION")
		private String MODIFIED_WORKSTATION;
		
		@Column(name = "COURSE_QUIZ")
		private String COURSE_QUIZ;

		public String getCOURSE_QUIZ() {
			return COURSE_QUIZ;
		}

		public void setCOURSE_QUIZ(String cOURSE_QUIZ) {
			COURSE_QUIZ = cOURSE_QUIZ;
		}

		public long getCOURSE_ID() {
			return COURSE_ID;
		}

		public void setCOURSE_ID(long cOURSE_ID) {
			COURSE_ID = cOURSE_ID;
		}

		public String getCOURSE_CODE() {
			return COURSE_CODE;
		}

		public void setCOURSE_CODE(String cOURSE_CODE) {
			COURSE_CODE = cOURSE_CODE;
		}

		public String getCOURSE_TITLE() {
			return COURSE_TITLE;
		}

		public void setCOURSE_TITLE(String cOURSE_TITLE) {
			COURSE_TITLE = cOURSE_TITLE;
		}

		public String getCOURSE_DESC() {
			return COURSE_DESC;
		}

		public void setCOURSE_DESC(String cOURSE_DESC) {
			COURSE_DESC = cOURSE_DESC;
		}

		public Long getCOURSE_CREDITHOUR() {
			return COURSE_CREDITHOUR;
		}

		public void setCOURSE_CREDITHOUR(Long cOURSE_CREDITHOUR) {
			COURSE_CREDITHOUR = cOURSE_CREDITHOUR;
		}
}
