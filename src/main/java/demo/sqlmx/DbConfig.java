package demo.sqlmx;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

//import com.tandem.t4jdbc.SQLMXDataSource;

//@Configuration
//@EnableAutoConfiguration (exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class DbConfig {

	//@Bean
	//@Primary
	//@ConfigurationProperties(value = "spring.datasource")
//	public DataSource dataSource1() {
//		String URL = "jdbc:t4sqlmx://<ipadress>:3200/:";
//		String user = "user";
//		String pass = "";
//		String catalog = "HNS_GENERAL_CAT001";
//		String schema = "HNS_GENERAL_SCH022";
//		String serverds = "tmxodbc01";
//
//		//TransactionAwareDataSourceProxy transactionAwareDataSourceProxy = new TransactionAwareDataSourceProxy();
//		SQLMXDataSource mxDatasource = new SQLMXDataSource();
//		mxDatasource.setPassword(pass);
//		mxDatasource.setUser(user);
//		mxDatasource.setUrl("jdbc1:t4sqlmx://10.42.195.156:3200/:");
//		mxDatasource.setCatalog(catalog);
//		mxDatasource.setSchema(schema);
//		mxDatasource.setServerDataSource(serverds);
//		return mxDatasource;
//		//transactionAwareDataSourceProxy.setTargetDataSource(mxDatasource);
//		//return transactionAwareDataSourceProxy;
//
//	}
}