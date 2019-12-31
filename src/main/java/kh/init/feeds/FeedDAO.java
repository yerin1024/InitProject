package kh.init.feeds;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.init.feeds.FeedDTO;

@Repository
public class FeedDAO {
	
	@Autowired
	private SqlSessionTemplate st;
	
	public List<FeedDTO> getList() throws Exception{
		List<FeedDTO> list = st.selectList("Feed.getList");
		return list;
	}
	
	public int getBoardSeq() throws Exception{
		int seq = st.selectOne("Feed.getBoardSeq");
		return seq;
	}
	
	public int write(FeedDTO dto) throws Exception{
		int result = st.insert("Feed.write", dto);
		return result;
	}
}
