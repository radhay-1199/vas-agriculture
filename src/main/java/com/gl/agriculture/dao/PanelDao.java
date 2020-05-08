package com.gl.agriculture.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.gl.agriculture.model.PanelContentModal;

@Component
public class PanelDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void setTemplate(JdbcTemplate template) {    
	    this.jdbcTemplate = template;    
	}  

	public List<PanelContentModal> allPanelData()
	{
		return jdbcTemplate.query("select * from contents where publisher='GL'", new  ResultSetExtractor<List<PanelContentModal>>() {

			@Override
			public List<PanelContentModal> extractData(ResultSet rs) throws SQLException, DataAccessException {
				//	landingPageModel list=new landingPageModel();
				List<PanelContentModal> list=new ArrayList<PanelContentModal>();
				while(rs.next())
				{
					PanelContentModal panelcontent=new PanelContentModal();
					//String id=String.valueOf(rs.getInt("pack_id"));

					panelcontent.setCnt_id(rs.getInt("content_id"));	
					panelcontent.setContent_name(rs.getString("content_name"));
					panelcontent.setContent_type(rs.getString("content_type"));
					panelcontent.setImage_name(rs.getString("image_name"));	
					panelcontent.setBase_format(rs.getString("base_format"));
					panelcontent.setContent_type(rs.getString("content_type"));
					panelcontent.setStatus(rs.getInt("status"));
					panelcontent.setLanguage(rs.getString("language"));
					panelcontent.setVideo_type(rs.getString("video_type"));
					panelcontent.setPublisher(rs.getString("publisher"));
					list.add(panelcontent);
						//System.out.println("------------------------" + list);
					
				}
				  return list;
			}
		});
	}
		
	public PanelContentModal  panelvideo(int id)
	{
		
		return jdbcTemplate.query("select * from contents where content_id='"+id+"' and publisher='GL'", new  ResultSetExtractor<PanelContentModal>() {


			@Override
			public PanelContentModal extractData(ResultSet rs) throws SQLException, DataAccessException {
				while(rs.next())
				{
					PanelContentModal panelcontent=new PanelContentModal();
					panelcontent.setContent_name(rs.getString("content_name"));
					panelcontent.setContent_type(rs.getString("content_type"));
					panelcontent.setImage_name(rs.getString("image_name"));
					panelcontent.setBase_format(rs.getString("base_format"));
					panelcontent.setContent_type(rs.getString("content_type"));
					panelcontent.setStatus(rs.getInt("status"));
					panelcontent.setVideo_type(rs.getString("video_type"));
					panelcontent.setPublisher(rs.getString("publisher"));
					return panelcontent;				
				}
				return null;
			}
		});
	}
}
