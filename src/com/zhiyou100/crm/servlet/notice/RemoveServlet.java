package com.zhiyou100.crm.servlet.notice;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.crm.service.NoticeService;
import com.zhiyou100.crm.service.impl.NoticeServiceImpl;
import com.zhiyou100.crm.util.AdminBaseServlet;

/**
 * 删除通知
 */
@WebServlet("/notice/remove")
public class RemoveServlet extends AdminBaseServlet {
	private static final long serialVersionUID = 1L;
	
	NoticeService noticeService = new NoticeServiceImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int noticeId = Integer.parseInt(request.getParameter("id"));

		noticeService.removeById(noticeId, user.getUserId(), Timestamp.valueOf(LocalDateTime.now()));
		response.sendRedirect(request.getContextPath() + "/notice/list");
	}

}
