select curdate();                       --��ȡ��ǰ����
select last_day(curdate());                    --��ȡ�������һ�졣
select DATE_ADD(curdate(),interval -day(curdate())+1 day);   --��ȡ���µ�һ��
select date_add(curdate()-day(curdate())+1,interval 1 month); -- ��ȡ�¸��µĵ�һ��
select DATEDIFF(date_add(curdate()-day(curdate())+1,interval 1 month ),DATE_ADD(curdate(),interval -day(curdate())+1 day)) from dual; --��ȡ��ǰ�µ�����







��ȡһ��ʱ����ÿ���
select date_add(curdate(), interval(cast(help_topic_id as signed integer) - 0) day) day
from mysql.help_topic
where help_topic_id   < 30
order by help_topic_id