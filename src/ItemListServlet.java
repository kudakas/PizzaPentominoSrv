

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ItemListServlet
 */
@WebServlet("/ItemListServlet")
public class ItemListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int itemACount = 1;
		int itemBCount = 1;
		int itemCCount = 1;
		int itemDCount = 1;
		int itemECount = 1;

		// セッションを取得
		HttpSession session = request.getSession();

		// 商品Aを注文している場合
		if(request.getParameter("itemA")!=null){
			if(session.getAttribute("itemACount") != null){
				itemACount =  Integer.parseInt(session.getAttribute("itemACount").toString());
				itemACount++;
				session.setAttribute("itemACount", itemACount);
			}else{
				session.setAttribute("itemACount", itemACount);
			}
		}

		// 商品Bを注文している場合
		if(request.getParameter("itemB")!=null){
			if(session.getAttribute("itemBCount") != null){
				itemBCount =  Integer.parseInt(session.getAttribute("itemBCount").toString());
				itemBCount++;
				session.setAttribute("itemBCount", itemBCount);
			}else{
				session.setAttribute("itemBCount", itemBCount);
			}
		}

		// 商品Cを注文している場合
		if(request.getParameter("itemC")!=null){
			if(session.getAttribute("itemCCount") != null){
				itemCCount =  Integer.parseInt(session.getAttribute("itemCCount").toString());
				itemCCount++;
				session.setAttribute("itemCCount", itemCCount);
			}else{
				session.setAttribute("itemCCount", itemCCount);
			}
		}

		// 商品Dを注文している場合
		if(request.getParameter("itemD")!=null){
			if(session.getAttribute("itemDCount") != null){
				itemDCount =  Integer.parseInt(session.getAttribute("itemDCount").toString());
				itemDCount++;
				session.setAttribute("itemDCount", itemDCount);
			}else{
				session.setAttribute("itemDCount", itemDCount);
			}
		}

		// 商品Eを注文している場合
		if(request.getParameter("itemE")!=null){
			if(session.getAttribute("itemECount") != null){
				itemECount =  Integer.parseInt(session.getAttribute("itemECount").toString());
				itemECount++;
				session.setAttribute("itemECount", itemECount);
			}else{
				session.setAttribute("itemECount", itemECount);
			}
		}

		response.sendRedirect("itemList.jsp");
	}
}
