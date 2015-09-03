package dto;

public class ItemListDto {

	/** 商品名 */
	private String goodsName;

	/** 数量 */
	private int count;

	/** 小計 */
	private int subTotal;

	/**
	 * 商品名を取得します。
	 * @return 商品名
	 */
	public String getGoodsName() {
	    return goodsName;
	}

	/**
	 * 商品名を設定します。
	 * @param goodsName 商品名
	 */
	public void setGoodsName(String goodsName) {
	    this.goodsName = goodsName;
	}

	/**
	 * 数量を取得します。
	 * @return 数量
	 */
	public int getCount() {
	    return count;
	}

	/**
	 * 数量を設定します。
	 * @param count 数量
	 */
	public void setCount(int count) {
	    this.count = count;
	}

	/**
	 * 小計を取得します。
	 * @return 小計
	 */
	public int getSubTotal() {
	    return subTotal;
	}

	/**
	 * 小計を設定します。
	 * @param subTotal 小計
	 */
	public void setSubTotal(int subTotal) {
	    this.subTotal = subTotal;
	}

}
