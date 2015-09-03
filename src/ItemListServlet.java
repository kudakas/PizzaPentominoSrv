

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.ItemListDto;

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
			if(session.getAttribute("itemA") != null){
				ItemListDto itemListDto = (ItemListDto)session.getAttribute("itemA");
				int count = itemListDto.getCount()+1;
				itemListDto.setCount(count);
				itemListDto.setCount(800*count);
				session.setAttribute("itemA", itemListDto);
			}else{
				ItemListDto itemListDto = new ItemListDto();
				itemListDto.setGoodsName("マルゲリータ");
				itemListDto.setCount(itemACount);
				itemListDto.setSubTotal(800*itemACount);
				session.setAttribute("itemA", itemListDto);
			}
		}else{
			ItemListDto itemListDto = new ItemListDto();
			itemListDto.setGoodsName("マルゲリータ");
			itemListDto.setCount(0);
			itemListDto.setSubTotal(0);
			session.setAttribute("itemA", itemListDto);
		}

		// 商品Bを注文している場合
		if(request.getParameter("itemB")!=null){
			if(session.getAttribute("itemB") != null){
				ItemListDto itemListDto = (ItemListDto)session.getAttribute("itemB");
				int count = itemListDto.getCount()  +1;
				itemListDto.setCount(count);
				itemListDto.setCount(900*count);
				session.setAttribute("itemB", itemListDto);
			}else{
				ItemListDto itemListDto = new ItemListDto();
				itemListDto.setGoodsName("バジル・トマト");
				itemListDto.setCount(itemBCount);
				itemListDto.setSubTotal(900*itemBCount);
				session.setAttribute("itemB", itemListDto);
			}
		}else{
			ItemListDto itemListDto = new ItemListDto();
			itemListDto.setGoodsName("バジル・トマト");
			itemListDto.setCount(0);
			itemListDto.setSubTotal(0);
			session.setAttribute("itemB", itemListDto);
		}

		// 商品Cを注文している場合
		if(request.getParameter("itemC")!=null){
			if(session.getAttribute("itemC") != null){
				ItemListDto itemListDto = (ItemListDto)session.getAttribute("itemC");
				int count = itemListDto.getCount()  +1;
				itemListDto.setCount(count);
				itemListDto.setCount(1000*count);
				session.setAttribute("itemC", itemListDto);
			}else{
				ItemListDto itemListDto = new ItemListDto();
				itemListDto.setGoodsName("ナス・ミートソース");
				itemListDto.setCount(itemCCount);
				itemListDto.setSubTotal(1000*itemCCount);
				session.setAttribute("itemC", itemListDto);
			}
		}else{
			ItemListDto itemListDto = new ItemListDto();
			itemListDto.setGoodsName("ナス・ミートソース");
			itemListDto.setCount(0);
			itemListDto.setSubTotal(0);
			session.setAttribute("itemC", itemListDto);
		}

		// 商品Dを注文している場合
		if(request.getParameter("itemD")!=null){
			if(session.getAttribute("itemD") != null){
				ItemListDto itemListDto = (ItemListDto)session.getAttribute("itemD");
				int count = itemListDto.getCount()  +1;
				itemListDto.setCount(count);
				itemListDto.setCount(1000*count);
				session.setAttribute("itemD", itemListDto);
			}else{
				ItemListDto itemListDto = new ItemListDto();
				itemListDto.setGoodsName("アンチョビ・シーフード");
				itemListDto.setCount(itemDCount);
				itemListDto.setSubTotal(1000*itemDCount);
				session.setAttribute("itemD", itemListDto);
			}
		}else{
			ItemListDto itemListDto = new ItemListDto();
			itemListDto.setGoodsName("アンチョビ・シーフード");
			itemListDto.setCount(0);
			itemListDto.setSubTotal(0);
			session.setAttribute("itemD", itemListDto);
		}

		// 商品Eを注文している場合
		if(request.getParameter("itemE")!=null){
			if(session.getAttribute("itemE") != null){
				ItemListDto itemListDto = (ItemListDto)session.getAttribute("itemE");
				int count = itemListDto.getCount()  +1;
				itemListDto.setCount(count);
				itemListDto.setCount(1300*count);
				session.setAttribute("itemE", itemListDto);
			}else{
				ItemListDto itemListDto = new ItemListDto();
				itemListDto.setGoodsName("チーズ・ミルフィーユ");
				itemListDto.setCount(itemECount);
				itemListDto.setSubTotal(1000*itemECount);
				session.setAttribute("itemE", itemListDto);
			}
		}else{
			ItemListDto itemListDto = new ItemListDto();
			itemListDto.setGoodsName("チーズ・ミルフィーユ");
			itemListDto.setCount(0);
			itemListDto.setSubTotal(0);
			session.setAttribute("itemE", itemListDto);
		}

		response.sendRedirect("itemList.jsp");
	}
}
