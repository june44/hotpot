package cn.hotpot.util;

public class Context {
	public static final String SEQ_NAME = "TY_SEQ";//oracle序列名
	/**--订单状态可选数据**/
	
	
	public static final Integer ORDER_WAIT = 1;//等待确认
	
	public static final Integer ORDER_ACCEPT = 2;//订单已确认
	
	public static final Integer ORDER_FINISH = 3;//订单已完成
	
	public static final Integer MEMBER_TYPE_TIME = 4;//次卡
	
	public static final Integer MEMBER_TYPE_DAY = 5;//日卡
	
	/*--职位表数据-*/
	public static final Integer POSITION_ADMIN = 1;//管理员
	
	public static final Integer POSITION_OPERATOR = 2;//操作员
	
	public static final Integer POSITION_COACH = 3;//普通教练
	
	public static final Integer POSITION_PRIVATE_COACH = 4;//私人教练
	
	/*------pay_method订单支付方式表里的数据------*/
	public static final Integer PAY_METHOD_CASH = 1;//现金
	
	public static final Integer PAY_METHOD_BALANCE = 2;//卡余额
	
	/*------bill_type订单类型表里的数据------*/

	public static final Integer BILL_TYPE_RECHARGE = 1;//充值卡余额
	
	public static final Integer BILL_TYPE_CONSUME_MEMBER_TYPE = 2;//消费，续（或办）会籍费
	
	public static final Integer BILL_TYPE_CONSUME_COACH = 3;//消费，购买教练
	
	public static final Integer BILL_TYPE_CONSUME_RENT_CABINET = 4;//消费，租衣柜
	
	public static final Integer BILL_TYPE_RETURN_RENT = 5;//退租金
	
	public static final Integer BILL_TYPE_RETURN_BALANCE = 6;//退卡里余额
	
	
	/*------status_type状态类型表里的数据------*/
	public static final Integer STATUS_TYPE_EMPLOYEE = 1;//员工
	
	public static final Integer STATUS_TYPE_MEMBER = 2;//会员
	
	public static final Integer STATUS_TYPE_CABINET = 3;//衣柜
	
	public static final Integer STATUS_TYPE_CABINET_RECORD = 4;//衣柜出租记录
	
	/*------status表里的数据------*/
	//员工状态
	public static final Integer EMPLOYEE_ON_JOB = 1;//在职
	
	public static final Integer EMPLOYEE_OUT_JOB = 2;//离职
	
	//会员状态
	public static final Integer MEMBER_VALID = 3;//可用
	
	public static final Integer MEMBER_LOCKED = 4;//禁用（锁定）
	
	public static final Integer MEMBER_UNVALID = 5;//注销（废弃）
	
	//衣柜状态
	public static final Integer CABINET_VALID = 6;//可用
	
	public static final Integer CABINET_RENT = 7;//已租
	
	public static final Integer CABINET_ABANDON = 8;//废弃

	
	//衣柜记录状态
	public static final Integer CABINET_RECORD_RENT = 9;//已租
	
	public static final Integer CABINET_RECORD_RETURN = 10;//返柜
}
