package xyz.erupt.upms.model.log;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEruptOperateLog is a Querydsl query type for EruptOperateLog
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEruptOperateLog extends EntityPathBase<EruptOperateLog> {

    private static final long serialVersionUID = -2126002585L;

    public static final QEruptOperateLog eruptOperateLog = new QEruptOperateLog("eruptOperateLog");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    public final StringPath apiName = createString("apiName");

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final StringPath errorInfo = createString("errorInfo");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath ip = createString("ip");

    public final StringPath operateUser = createString("operateUser");

    public final StringPath region = createString("region");

    public final StringPath reqAddr = createString("reqAddr");

    public final StringPath reqMethod = createString("reqMethod");

    public final StringPath reqParam = createString("reqParam");

    public final BooleanPath status = createBoolean("status");

    public final NumberPath<Long> totalTime = createNumber("totalTime", Long.class);

    public QEruptOperateLog(String variable) {
        super(EruptOperateLog.class, forVariable(variable));
    }

    public QEruptOperateLog(Path<? extends EruptOperateLog> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEruptOperateLog(PathMetadata metadata) {
        super(EruptOperateLog.class, metadata);
    }

}

