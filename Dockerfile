FROM hseeberger/scala-sbt:11.0.20_1.9.9_2.12.18

WORKDIR /app
COPY . /app

RUN sbt update

CMD ["sbt", "test"]