

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CertListClearServlet
 */
@WebServlet("/CertListClearServlet")
public class CertListClearServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 注文の中身をクリアにする
		// セッションを取得する
		HttpSession session = request.getSession();
		// キー一覧を取得する
		Enumeration<String> e = session.getAttributeNames();

		// 取得したキーに格納されているオブジェクト(注文したピザ)を削除する
		while(e.hasMoreElements()) {
			String key = (String)e.nextElement();
			switch(key){
			case "itemACount":
				session.removeAttribute("itemACount");
				break;
			case "itemBCount":
				session.removeAttribute("itemBCount");
				break;
			case "itemCCount":
				session.removeAttribute("itemCCount");
				break;
			case "itemDCount":
				session.removeAttribute("itemDCount");
				break;
			case "itemECount":
				session.removeAttribute("itemECount");
				break;
			}
		}
		// 商品一覧画面へ遷移する
		response.sendRedirect("itemList.jsp");
	}

}
