package xyz.erupt.upms.model.log;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEruptLoginLog is a Querydsl query type for EruptLoginLog
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEruptLoginLog extends EntityPathBase<EruptLoginLog> {

    private static final long serialVersionUID = -669974494L;

    public static final QEruptLoginLog eruptLoginLog = new QEruptLoginLog("eruptLoginLog");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    public final StringPath browser = createString("browser");

    public final StringPath deviceType = createString("deviceType");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath ip = createString("ip");

    public final DateTimePath<java.util.Date> loginTime = createDateTime("loginTime", java.util.Date.class);

    public final StringPath region = createString("region");

    public final StringPath systemName = createString("systemName");

    public final StringPath token = createString("token");

    public final StringPath userName = createString("userName");

    public QEruptLoginLog(String variable) {
        super(EruptLoginLog.class, forVariable(variable));
    }

    public QEruptLoginLog(Path<? extends EruptLoginLog> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEruptLoginLog(PathMetadata metadata) {
        super(EruptLoginLog.class, metadata);
    }

}

