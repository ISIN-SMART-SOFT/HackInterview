**>>** Команда проверить, что **docker-compose** локально присутствует:
```bash
docker-compose --version
```
> Docker Compose version v2.13.0

**>>** Команда запуска:
```bash
docker-compose -f compose-env.yaml up -d
```

> `-d` - _включает режим демона_

**>>** Команда удаляет контейнер, где есть упоминание о порте 5444
```bash
docker rm -f $(docker ps | grep 5444)
```