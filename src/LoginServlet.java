

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// リクエストパラメータから入力されたパスワードを取り出し
		String password = request.getParameter("password");

		// セッションを取得
		HttpSession session= request.getSession();

		String nextJsp;
		if("webtext".equals(password)){
			// 正しいパスワードの場合
			// ユーザー名をリクエストに格納する
			String user = request.getParameter("user");
			session.setAttribute("user",user);

			// 繊維先を商品一覧画面にする
			nextJsp = "/itemList.jsp";
		}else{
			// パスワードが正しくなければ、繊維先をログイン失敗ページにする。
			nextJsp = "/loginFailed.jsp";
		}

		// 遷移先のJSPへフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextJsp);
		dispatcher.forward(request, response);
	}

}
