package cl.bennu.springbootlabs2.dao.iface;

import cl.bennu.springbootlabs2.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface IProductDAO {

    @Select("SELECT ID AS ID, NOMBRE AS NAME FROM PRODUCTO")
    List<Product> getAll();

    @Select("SELECT ID AS ID, NOMBRE AS NAME FROM PRODUCTO WHERE ID = 10")
    List<Product> find(Product product);

    @Select("SELECT ID AS ID, NOMBRE AS NAME FROM PRODUCTO WHERE ID = #{id}")
    Product getById(@Param("id") Long id);

    void save(Product product);

    void delete(Long id);


}
