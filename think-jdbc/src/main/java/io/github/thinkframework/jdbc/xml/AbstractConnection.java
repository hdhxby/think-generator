package io.github.thinkframework.jdbc.xml;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * Created by lixiaobin on 2017/4/25.
 */
public abstract class AbstractConnection implements Connection{
    protected String url;
    protected Properties properties;

    protected boolean closed;
    protected boolean readOnly;
    protected boolean autoCommit;

    protected AbstractConnection(){
    }

    public AbstractConnection(String url, Properties properties) {
        this.url = url;
        this.properties = properties;
    }

    @Override
    public Statement createStatement() throws SQLException {
        throw new SQLException();
    }

    @Override
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        throw new SQLException();
    }

    @Override
    public CallableStatement prepareCall(String sql) throws SQLException {
        throw new SQLException();
    }

    @Override
    public String nativeSQL(String sql) throws SQLException {
        throw new SQLException();
    }

    @Override
    public void setAutoCommit(boolean autoCommit) throws SQLException {
        this.autoCommit = autoCommit;
    }

    @Override
    public boolean getAutoCommit() throws SQLException {
        return autoCommit;
    }

    @Override
    public void commit() throws SQLException {
        throw new SQLException();
    }

    @Override
    public void rollback() throws SQLException {
        throw new SQLException();
    }

    @Override
    public void close() throws SQLException {
        closed = true;
    }

    @Override
    public boolean isClosed() throws SQLException {
        return closed;
    }

    @Override
    public abstract DatabaseMetaData getMetaData() throws SQLException;

    @Override
    public void setReadOnly(boolean readOnly) throws SQLException {
        this.readOnly = readOnly;
    }

    @Override
    public boolean isReadOnly() throws SQLException {
        return readOnly;
    }

    @Override
    public void setCatalog(String catalog) throws SQLException {
        throw new SQLException();
    }

    @Override
    public String getCatalog() throws SQLException {
        throw new SQLException();
    }

    @Override
    public void setTransactionIsolation(int level) throws SQLException {
        throw new SQLException();
    }

    @Override
    public int getTransactionIsolation() throws SQLException {
        return Connection.TRANSACTION_NONE;
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        throw new SQLException();
    }

    @Override
    public void clearWarnings() throws SQLException {

    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        throw new SQLException();
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        throw new SQLException();
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        throw new SQLException();
    }

    @Override
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        throw new SQLException();
    }

    @Override
    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
        throw new SQLException();
    }

    @Override
    public void setHoldability(int holdability) throws SQLException {
        throw new SQLException();
    }

    @Override
    public int getHoldability() throws SQLException {
        return ResultSet.CLOSE_CURSORS_AT_COMMIT;
    }

    @Override
    public Savepoint setSavepoint() throws SQLException {
        throw new SQLException();
    }

    @Override
    public Savepoint setSavepoint(String name) throws SQLException {
        throw new SQLException();
    }

    @Override
    public void rollback(Savepoint savepoint) throws SQLException {
        throw new SQLException();
    }

    @Override
    public void releaseSavepoint(Savepoint savepoint) throws SQLException {
        throw new SQLException();
    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        throw new SQLException();
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        throw new SQLException();
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        throw new SQLException();
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        throw new SQLException();
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        throw new SQLException();
    }

    @Override
    public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        throw new SQLException();
    }

    @Override
    public Clob createClob() throws SQLException {
        throw new SQLException();
    }

    @Override
    public Blob createBlob() throws SQLException {
        throw new SQLException();
    }

    @Override
    public NClob createNClob() throws SQLException {
        throw new SQLException();
    }

    @Override
    public SQLXML createSQLXML() throws SQLException {
        throw new SQLException();
    }

    @Override
    public boolean isValid(int timeout) throws SQLException {
        throw new SQLException();
    }

    @Override
    public void setClientInfo(String name, String value) throws SQLClientInfoException {
        throw new SQLClientInfoException();
    }

    @Override
    public void setClientInfo(Properties properties) throws SQLClientInfoException {
        throw new SQLClientInfoException();
    }

    @Override
    public String getClientInfo(String name) throws SQLException {
        throw new SQLException();
    }

    @Override
    public Properties getClientInfo() throws SQLException {
        throw new SQLException();
    }

    @Override
    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        throw new SQLException();
    }

    @Override
    public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
        throw new SQLException();
    }

    @Override
    public void setSchema(String schema) throws SQLException {
        throw new SQLException();
    }

    @Override
    public String getSchema() throws SQLException {
        throw new SQLException();
    }

    @Override
    public void abort(Executor executor) throws SQLException {
        throw new SQLException();
    }

    @Override
    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
        throw new SQLException();
    }

    @Override
    public int getNetworkTimeout() throws SQLException {
        throw new SQLException();
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        throw new SQLException();
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        throw new SQLException();
    }
}