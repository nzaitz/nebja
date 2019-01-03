package nebja.beans;

public class Comment {
public Comment(int commentid, String usercomment) {
		super();
		this.commentid = commentid;
		this.usercomment = usercomment;
	}
private int commentid;
private String usercomment;
public int getCommentid() {
	return commentid;
}
public void setCommentid(int commentid) {
	this.commentid = commentid;
}
public String getUsercomment() {
	return usercomment;
}
public void setUsercomment(String usercomment) {
	this.usercomment = usercomment;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + commentid;
	result = prime * result + ((usercomment == null) ? 0 : usercomment.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Comment other = (Comment) obj;
	if (commentid != other.commentid)
		return false;
	if (usercomment == null) {
		if (other.usercomment != null)
			return false;
	} else if (!usercomment.equals(other.usercomment))
		return false;
	return true;
}
@Override
public String toString() {
	return "Comment [commentid=" + commentid + ", usercomment=" + usercomment + "]";
}
}
