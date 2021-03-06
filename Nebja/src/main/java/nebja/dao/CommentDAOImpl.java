package nebja.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import nebja.beans.Comment;
import nebja.beans.User;
import nebja.util.NebjaUtil;

public class CommentDAOImpl implements CommentDAO {
static SessionFactory sf = NebjaUtil.getSessionFactory();
	
/**
 * This function gets all comments in our movie database
 */
@Override
	public List<Comment> getAllComments() {
		List<Comment> comments = new ArrayList<>();	
		try(Session s = sf.getCurrentSession()){
				Transaction tx = s.beginTransaction();
				comments = s.createQuery("from Comment").getResultList();
				tx.commit();
				s.close();	
				
		}
		return comments;
	}

	@Override
	public List<Comment> getAllCommentsbyID(int id) {
		
		return null;
	}

	/**
	 * This Function makes comments and inserts them into database
	 */
	
	@Override
	public void makeAComment(Comment comment) {
		try(Session s = sf.getCurrentSession()){
			Transaction tx = s.beginTransaction();
			s.persist(comment);
			tx.commit();
			s.close();
		}
		}
	}


