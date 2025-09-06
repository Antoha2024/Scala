FROM hseeberger/scala-sbt:11.0.19_1.9.9_3.1.1

WORKDIR /app
COPY . /app

# По желанию: предварительная сборка зависимостей
RUN sbt update

CMD ["sbt", "test"]