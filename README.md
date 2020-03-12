

1. Criar as 3 entidades que representam o cupom de venda conforme abaixo

Tabela:TB_CUPOM

Campos:
ID_CUPOM Long (primary key)
ID_CLIENTE Long
DT_VENDA String
VL_VENDA BigDecimal

Tabela: TB_CUPOM_ITEM

Campos:
ID_CUPOM_ITEM Long (primary key)
ID_CUPOM Long (foreign key da tabela TB_CUPOM)
ID_PRODUTO Long (foreign key da tabela TB_PRODUTO)
QT_PRODUTO Long
VL_PRODUTO BigDecimal

Tabela TB_PRODUTO

Campos:
ID_PRODUTO Long (primary key)
DS_PRODUTO String

2. Criar um repository para a entidade da tabela TbCupom e implementar um metodo de consulta que retornará uma lista através das pesquisas de
ID_ClIENTE e DT_VENDA

3. Criar uma nova classe de Service que implemente um novo método que execute o método implementado no item 2 e retorne o resultado.

4. Criar uma classe de controller e implementar um endpoint de consulta que receba os parametros de id_cliente e dt_venda