package br.jus.trf2.xjus.record.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.crivano.swaggerservlet.ISwaggerMethod;
import com.crivano.swaggerservlet.ISwaggerModel;
import com.crivano.swaggerservlet.ISwaggerRequest;
import com.crivano.swaggerservlet.ISwaggerResponse;

public interface IXjusRecordAPI {
	public static class RefId implements ISwaggerModel {
	}

	public static class RefDate implements ISwaggerModel {
	}

	public static class Object implements ISwaggerModel {
	}

	public static class Acl implements ISwaggerModel {
	}

	public static class Refresh implements ISwaggerModel {
	}

	public static class Last implements ISwaggerModel {
	}

	public static class Url implements ISwaggerModel {
	}

	public static class Code implements ISwaggerModel {
	}

	public static class Title implements ISwaggerModel {
	}

	public static class Content implements ISwaggerModel {
	}

	public static class Field implements ISwaggerModel {
		public String name;
		public String kind;
		public String value;
	}

	public static class Facet implements ISwaggerModel {
		public String name;
		public String kind;
		public String value;
	}

	public static class Status implements ISwaggerModel {
	}

	public static class Reference implements ISwaggerModel {
		public String id;
		public Date date;
	}

	public static class Error implements ISwaggerModel {
		public String errormsg;
	}

	public interface IAllReferencesGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String lastid;
			public String max;
		}

		public static class Response implements ISwaggerResponse {
			public List<Reference> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, XjusRecordAPIContext ctx) throws Exception;
	}

	public interface IChangedReferencesGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public Date lastdate;
			public String lastid;
			public String max;
		}

		public static class Response implements ISwaggerResponse {
			public List<Reference> list = new ArrayList<>();
		}

		public void run(Request req, Response resp, XjusRecordAPIContext ctx) throws Exception;
	}

	public interface IRecordIdGet extends ISwaggerMethod {
		public static class Request implements ISwaggerRequest {
			public String id;
		}

		public static class Response implements ISwaggerResponse {
			public String id;
			public String status;
			public String acl;
			public String refresh;
			public String url;
			public String code;
			public String title;
			public String content;
			public List<Field> field = new ArrayList<>();
			public List<Facet> facet = new ArrayList<>();
		}

		public void run(Request req, Response resp, XjusRecordAPIContext ctx) throws Exception;
	}

}
