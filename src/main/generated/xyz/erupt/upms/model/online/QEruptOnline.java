package xyz.erupt.upms.model.online;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEruptOnline is a Querydsl query type for EruptOnline
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEruptOnline extends EntityPathBase<EruptOnline> {

    private static final long serialVersionUID = -245744769L;

    public static final QEruptOnline eruptOnline = new QEruptOnline("eruptOnline");

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

    public QEruptOnline(String variable) {
        super(EruptOnline.class, forVariable(variable));
    }

    public QEruptOnline(Path<? extends EruptOnline> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEruptOnline(PathMetadata metadata) {
        super(EruptOnline.class, metadata);
    }

}

