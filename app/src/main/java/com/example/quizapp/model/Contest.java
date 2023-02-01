package com.example.quizapp.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Contest{

	@SerializedName("duration")
	private int duration;

	@SerializedName("quizMasterId")
	private String quizMasterId;

	@SerializedName("contestId")
	private String contestId;

	@SerializedName("approved")
	private boolean approved;

	@SerializedName("quizType")
	private String quizType;

	@SerializedName("questionsData")
	private List<QuestionsItem> questions;

	@SerializedName("contestName")
	private String contestName;

	@SerializedName("totalMarks")
	private int totalMarks;

	@SerializedName("moderatorId")
	private String moderatorId;

	@SerializedName("contentCategory")
	private String contentCategory;

	public void setDuration(int duration){
		this.duration = duration;
	}

	public int getDuration(){
		return duration;
	}

	public void setQuizMasterId(String quizMasterId){
		this.quizMasterId = quizMasterId;
	}

	public String getQuizMasterId(){
		return quizMasterId;
	}

	public void setContestId(String contestId){
		this.contestId = contestId;
	}

	public String getContestId(){
		return contestId;
	}

	public void setApproved(boolean approved){
		this.approved = approved;
	}

	public boolean isApproved(){
		return approved;
	}

	public void setQuizType(String quizType){
		this.quizType = quizType;
	}

	public String getQuizType(){
		return quizType;
	}

	public void setQuestions(List<QuestionsItem> questions){
		this.questions = questions;
	}

	public List<QuestionsItem> getQuestions(){
		return questions;
	}

	public void setContestName(String contestName){
		this.contestName = contestName;
	}

	public String getContestName(){
		return contestName;
	}

	public void setTotalMarks(int totalMarks){
		this.totalMarks = totalMarks;
	}

	public int getTotalMarks(){
		return totalMarks;
	}

	public void setModeratorId(String moderatorId){
		this.moderatorId = moderatorId;
	}

	public String getModeratorId(){
		return moderatorId;
	}

	public void setContentCategory(String contentCategory){
		this.contentCategory = contentCategory;
	}

	public String getContentCategory(){
		return contentCategory;
	}

	@Override
 	public String toString(){
		return 
			"Contest{" + 
			"duration = '" + duration + '\'' + 
			",quizMasterId = '" + quizMasterId + '\'' + 
			",contestId = '" + contestId + '\'' + 
			",approved = '" + approved + '\'' + 
			",quizType = '" + quizType + '\'' + 
			",questions = '" + questions + '\'' + 
			",contestName = '" + contestName + '\'' + 
			",totalMarks = '" + totalMarks + '\'' + 
			",moderatorId = '" + moderatorId + '\'' + 
			",contentCategory = '" + contentCategory + '\'' + 
			"}";
		}
}