use empresa;
select primeiro_nome, segundo_nome, ultimo_nome from funcionario where segundo_nome is null order by primeiro_nome, ultimo_nome;