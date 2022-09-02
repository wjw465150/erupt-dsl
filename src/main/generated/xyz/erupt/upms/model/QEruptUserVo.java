package xyz.erupt.upms.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEruptUserVo is a Querydsl query type for EruptUserVo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEruptUserVo extends EntityPathBase<EruptUserVo> {

    private static final long serialVersionUID = -1801362219L;

    public static final QEruptUserVo eruptUserVo = new QEruptUserVo("eruptUserVo");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public QEruptUserVo(String variable) {
        super(EruptUserVo.class, forVariable(variable));
    }

    public QEruptUserVo(Path<? extends EruptUserVo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEruptUserVo(PathMetadata metadata) {
        super(EruptUserVo.class, metadata);
    }

}

