package com.jeecms.bbs;

/**
 * BBS常量
 * 
 * @author liqiang
 * 
 */
public class Constants {
	/**
	 * 首页模板
	 */
	public static final String TPLDIR_INDEX = "index";
	/**
	 * 主题列表模板
	 */
	public static final String TPLDIR_FORUM = "forum";
	/**
	 * 主题列表模板
	 */
	public static final String TPLDIR_POST = "post";
	/**
	 * 主题详细页模板
	 */
	public static final String TPLDIR_TOPIC = "topic";
	/**
	 * 单页模板
	 */
	public static final String TPLDIR_ALONE = "alone";
	/**
	 * 会员中心模板
	 */
	public static final String TPLDIR_MEMBER = "member";
	/**
	 * 专用模板
	 */
	public static final String TPLDIR_SPECIAL = "special";
	/**
	 * 公用模板
	 */
	public static final String TPLDIR_COMMON = "common";
	/**
	 * 客户端包含模板
	 */
	public static final String TPLDIR_CSI = "csi";
	/**
	 * 客户端包含用户自定义模板
	 */
	public static final String TPLDIR_CSI_CUSTOM = "csi_custom";
	/**
	 * 服务器端包含模板
	 */
	public static final String TPLDIR_SSI = "ssi";
	/**
	 * 标签模板
	 */
	public static final String TPLDIR_TAG = "tag";
	/**
	 * 列表样式模板
	 */
	public static final String TPLDIR_STYLE_LIST = "style_list";
	/**
	 * 列表样式模板
	 */
	public static final String TPLDIR_STYLE_PAGE = "style_page";

	/**
	 * 模板后缀
	 */
	public static final String TPL_SUFFIX = ".html";

	/**
	 * 上传路径
	 */
	public static final String UPLOAD_PATH = "/u/cms/";
	/**
	 * 资源路径
	 */
	public static final String RES_PATH = "/r/cms";
	/**
	 * 模板路径
	 */
	public static final String TPL_BASE = "/WEB-INF/t/cms";
	/**
	 * 全文检索索引路径
	 */
	public static final String LUCENE_PATH = "/WEB-INF/lucene";
	/**
	 * 列表样式模板路径
	 */
	public static final String TPL_STYLE_LIST = "/WEB-INF/t/cms_sys_defined/style_list/style_";
	/**
	 * 内容分页模板路径
	 */
	public static final String TPL_STYLE_PAGE_CONTENT = "/WEB-INF/t/cms_sys_defined/style_page/content_";
	/**
	 * 列表分页模板路径
	 */
	public static final String TPL_STYLE_PAGE_CHANNEL = "/WEB-INF/t/cms_sys_defined/style_page/channel_";
	
	/**
	 * 列表分页模板路径
	 */
	public static final String TPL_STYLE_PAGE_TOPIC = "/WEB-INF/t/cms_sys_defined/style_page/topic_";
	/**
	 * 页面禁止访问
	 */
	public static final String ERROR_403 = "error/403";
	/**
	 * 道具使用页
	 */
	public static final String TPLDIR_MAGIC = "magic";
	
	/**
	 * 每日毫秒数
	 */
	public static final long DAY_MILLIS = 24 * 60 * 60 * 1000;
}
