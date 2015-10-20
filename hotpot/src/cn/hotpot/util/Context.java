package cn.hotpot.util;

public class Context {
	public static final String SEQ_NAME = "TY_SEQ";//oracle序列名
	/**--订单状态可选数据  belong=1**/
	public static final Integer ORDER_WAIT = 1;//等待确认
	
	public static final Integer ORDER_ACCEPT = 2;//订单已确认
	
	public static final Integer ORDER_FINISH = 3;//订单已完成
	
	//员工状态belong=2
	public static final Integer EMPLOYEE_ON_JOB = 4;//在职
		
	public static final Integer EMPLOYEE_OUT_JOB = 5;//离职
	
	//员工工作中状态 belong=3
	public static final Integer EMPLOYEE_JOB_FREE = 6;//空闲
	
	public static final Integer EMPLOYEE_JOB_BUSY = 7;//繁忙
	
	//餐桌状态 belong=4
	public static final Integer TABLE_FREE = 8;//空闲
	
	public static final Integer TABLE_BUSY = 9;//占用
	
	//订单中需要的菜的状态 belong=5
	public static final Integer DISH_WAIT = 10;//等待制作
	
	public static final Integer DISH_MAKING = 11;//制作中
	
	public static final Integer DISH_DELIVERY = 12;//配送中
	
	public static final Integer DISH_FINISH = 13;//制作完成
	
	//采购申请状态 belong=6
	public static final Integer APPLY_WAIT = 14;//等待审核
	
	public static final Integer APPLY_PASS = 15;//审核通过
	
	public static final Integer APPLY_FAIL = 16;//审核失败
	
	/*--职位表数据-*/
	public static final Integer POSITION_ADMIN = 1;//管理员
	
	public static final Integer POSITION_OPERATOR = 2;//营业员
	
	public static final Integer POSITION_HEAD_CHEF = 3;//厨师长
	
	public static final Integer POSITION_WAITER = 4;//服务员
	
	public static final Integer POSITION_MANAGER = 5;//经理
	
	
	/*------bill_type订单类型表里的数据------*/

	public static final Integer BILL_TYPE_RECHARGE = 1;//充值卡余额
	
	public static final Integer BILL_TYPE_CONSUME_MEMBER_TYPE = 2;//消费，续（或办）会籍费
	
	public static final Integer BILL_TYPE_CONSUME_COACH = 3;//消费，购买教练
	
	public static final Integer BILL_TYPE_CONSUME_RENT_CABINET = 4;//消费，租衣柜
	
	public static final Integer BILL_TYPE_RETURN_RENT = 5;//退租金
	
	public static final Integer BILL_TYPE_RETURN_BALANCE = 6;//退卡里余额
	
	
}
